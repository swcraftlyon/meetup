const conf = require('./gulp.conf');

module.exports = function (config) {
  var configuration = {
    browsers: [
      'PhantomJS'
    ],
    basePath: '../',
    singleRun: false,
    autoWatch: true,
    logLevel: 'INFO',
    junitReporter: {
      outputDir: 'test-reports'
    },
    frameworks: [
      'phantomjs-shim',
      'jasmine'
    ],
    files: [
      'node_modules/es6-shim/es6-shim.js',
      conf.path.src('index.spec.js')
    ],
    preprocessors: {
      [conf.path.src('index.spec.js')]: [
        'webpack'
      ]
    },
    webpack: require('./webpack-test.conf.js'),
    webpackMiddleware: {
      noInfo: true
    },
    plugins: [
      require('karma-jasmine'),
      require('karma-junit-reporter'),
      require('karma-phantomjs-launcher'),
      require('karma-phantomjs-shim'),
      require('karma-coverage'),
      require('karma-webpack')
    ]
  };

  config.set(configuration);
};
