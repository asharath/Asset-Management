var app = angular.module('myApp', ['ui.grid']);
app.controller('MyCtrl', function($scope, $http) {
 
  $scope.gridOptions1 = {
    enableSorting:true,	
    showGroupPanel: true,
    enableGridMenu:true,
      };
      $http.get('/api/user').then(function(response) {
         $scope.users= response.data;
	$scope.gridOptions1.data = response.data;

      });

      
      $scope.gridOptions2 = {
   
    enableSorting:true,	
    showGroupPanel: true,
    enableGridMenu:true,
      };
      $http.get('/api/gadget').then(function(response) {
         $scope.gadgets= response.data;
	$scope.gridOptions2.data = response.data;

      });

});


