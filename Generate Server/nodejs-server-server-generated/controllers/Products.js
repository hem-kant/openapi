'use strict';

var utils = require('../utils/writer.js');
var Products = require('../service/ProductsService');

module.exports.getProductDetails = function getProductDetails (req, res, next, productsId) {
  Products.getProductDetails(productsId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getProducts = function getProducts (req, res, next, categoryId) {
  Products.getProducts(categoryId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
