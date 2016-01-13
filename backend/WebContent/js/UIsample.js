var app = angular.module('myApp', ['ngGrid']);
app.controller('MyCtrl', function($scope) {
  $scope.myData = [{ID: 101, name: "Moroni", age: 50, email:"mor@live.se", phone:012345678},
    {ID: 102, name: "Tiancum", age: 43, email:"tit@gmail.com", phone:65347215},
    {ID:201, name: "Jacob", age: 27, email:"jac@hotmail.com", phone: 213425532},
    {ID: 223, name: "Nephi", age: 29, email:"nep@gmail.com", phone:23144515 },
    {ID: 321, name: "Enos", age: 34, email: "eno@live.se", phone: 86284682}];
  $scope.gridOptions = {
    data: 'myData',
     enableCellEditOnFocus: true,

    columnDefs: [{field:'ID',displayName:'ID', enableCellEdit: true}, {field:'name', displayName:'Employee Name', enableCellEdit: true}, {field:'age', displayName:'Age', enableCellEdit: true},{field:'email', displayName:'Email', enableCellEdit: true},{field:'phone', displayName:'Contact number', enableCellEdit: true}],
    showGroupPanel: true
  };
});
