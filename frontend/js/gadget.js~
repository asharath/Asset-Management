angular.module('myApp', [])
    .controller('MyCtrl', function($scope, $http) {

        $scope.addGadget = function(gadget) {
            $http.put('/api/gadget', gadget).then(function(response) {
	    refreshAllGadgets();
	    alert("New Gadget added!");
	    window.location.assign("../gadgt.html")            
	});
        }
        function refreshAllGadgets() {
          $http.get('/api/gadget').then(function(response) {
               $scope.gadgets = response.data;
          });
        }
    });
