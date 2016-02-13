
/* globals require */
var context = require.context('./app', true, /\.spec$/);
context.keys().forEach(context);
