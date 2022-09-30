'use strict';


/**
 * Returns the list of all products categories
 * Returns the list of all products and categories  which is available on shopOnline portal 
 *
 * categoryId Integer  (optional)
 * returns List
 **/
exports.getCategories = function(categoryId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "name" : "name",
  "categoryId" : 0
}, {
  "name" : "name",
  "categoryId" : 0
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Returns the list of all products categories
 * Returns the list of all products and categories which is available on shopOnline portal
 *
 * categoryId Integer 
 * returns category
 **/
exports.getCategoryDetails = function(categoryId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {
  "name" : "name",
  "categoryId" : 0
};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

