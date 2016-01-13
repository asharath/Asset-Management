angular.module('myApp', [])
  .controller('MyCtrl', function($scope, $http){ 
	refreshAllEmployees();
    $scope.addEmployee = function(Employee) {
      $http.put('/api/Employee', Employee).then(function(response) {
	window.location.assign("../admin2.html")
	refreshAllEmployees();      
	});
	}
    });
 
