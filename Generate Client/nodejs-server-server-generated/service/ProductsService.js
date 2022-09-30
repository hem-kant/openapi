'use strict';


/**
 * Returns the products details
 * Returns the products details based on ID which is available on shopOnline portal
 *
 * productsId Integer 
 * returns products
 **/
exports.getProductDetails = function(productsId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "quantity" : 1,
  "productId" : 0,
  "price" : 6.0274563,
  "name" : "name",
  "releseDate" : "2000-01-23",
  "categoryName" : "categoryName"
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Returns the list of all products
 * Returns the list of all products which is available on shopOnline portal
 *
 * categoryId Integer  (optional)
 * returns List
 **/
exports.getProducts = function(categoryId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
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
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

