var app = angular.module('myApp', ['ui.grid','ui.grid.selection', 'ui.grid.cellNav']);
app.controller('MyCtrl', function($scope, $http) {
 
  $scope.gridOptions = {};
      $http.get('/api/user').then(function(response) {
         $scope.users= response.data;
	$scope.gridOptions.data = response.data;

      });

      

});


