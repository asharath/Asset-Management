angular.module('myApp', [])
    .controller('MyCtrl', function($scope, $http) {

        $scope.addModel = function(model) {
            $http.put('/api/model', model).then(function(response) {
	    refreshAllModels();
	    alert("New Model added!");
	    window.location.assign("../mod.html")            
	});
        }
        function refreshAllModels() {
          $http.get('/api/model').then(function(response) {
               $scope.models = response.data;
          });
        }
    });
