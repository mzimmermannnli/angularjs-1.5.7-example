angular.module('hello', [])
  .controller('home', function($http) {
	  var self = this;
	  $http.get('/resource').then(function(response) {
		  self.greeting = response.data;
	  }, function(reason) {
	  	
	  }, function(value) {
	  	
	  })
})