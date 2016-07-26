var gulp = require('gulp');
var inject = require('gulp-inject');
var bowerFiles = require('main-bower-files');

gulp.task('default', function () {
});

gulp.task('inject', function () {
	var stream = gulp.src('./src/main/resources/static/index.html')
	.pipe(inject(gulp.src(bowerFiles(), {read: false}), {
            name: 'bower',
            relative: true
        }))
    .pipe(gulp.dest('./src/main/resources/static'));
});