'use strict';


/**
 * Get order
 * Get order details based on ID
 *
 * orderId Integer 
 * fetchType String Fetch Type:   * `summary` - will provide the order summary   * `details` - will provide the sumamr & details of order address 
 * returns inline_response_200_1
 **/
exports.anyOfOrdersGET = function(orderId,fetchType) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = "";
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * delete order api
 * delete order details
 *
 * orderId Integer 
 * no response value expected for this operation
 **/
exports.deleteOrderDetails = function(orderId) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * get order details
 * get order details
 *
 * orderId Integer 
 * returns inline_response_200
 **/
exports.getOrderDetails = function(orderId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "address" : {
    "zipcode" : "zipcode",
    "city" : "city",
    "state" : "ND",
    "addressLine" : "addressLine",
    "isOfficeAddress" : true
  },
  "orderId" : 0,
  "products" : [ {
    "quantity" : 1,
    "productId" : 0,
    "price" : 6.0274563,
    "name" : "name",
    "releseDate" : "2000-01-23",
    "categoryName" : "categoryName"
  }, {
    "quantity" : 1,
    "productId" : 0,
    "price" : 6.0274563,
    "name" : "name",
    "releseDate" : "2000-01-23",
    "categoryName" : "categoryName"
  } ]
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Insert oneof the order details
 * Insert oneof the order details in shopping cart
 *
 * body OneOfOrders_body  (optional)
 * no response value expected for this operation
 **/
exports.oneOfOrdersPOST = function(body) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * order api
 * Post order details for processing 
 *
 * body Orders_body_1  (optional)
 * returns inline_response_201
 **/
exports.saveOrderDetails = function(body) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "orderId" : 0
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * update order api
 * update order details for processing 
 *
 * body Orders_body  (optional)
 * no response value expected for this operation
 **/
exports.updateOrderdetails = function(body) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}

