const path = require('path');

const gulp = require('gulp');
const HubRegistry = require('gulp-hub');

const conf = require('./conf/gulp.conf');

// Load some files into the registry
const hub = new HubRegistry([
  'gulp_tasks/misc.js',
  'gulp_tasks/styles.js',
  'gulp_tasks/browsersync.js',
  'gulp_tasks/karma.js',
  'gulp_tasks/protractor.js',
  'gulp_tasks/webpack.js'
]);

// Tell gulp to use the tasks just loaded
gulp.registry(hub);

gulp.task('build', gulp.series(gulp.parallel('other', 'webpack:dist')));
gulp.task('test', gulp.series('karma:single-run'));
gulp.task('test:auto', gulp.series('karma:auto-run'));
gulp.task('serve', gulp.series('webpack:watch', 'watch', 'browsersync'));
gulp.task('serve:dist', gulp.series('default', 'browsersync:dist'));
gulp.task('default', gulp.series('clean', 'build'));
gulp.task('watch', watch);

function watch(done) {
  gulp.watch([
    path.join(conf.paths.src, '/app/**/*.scss'),
    path.join(conf.paths.src, '/app/**/*.css')
  ], gulp.series('styles'));

  done();
}
