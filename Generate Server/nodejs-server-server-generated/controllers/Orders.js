'use strict';

var utils = require('../utils/writer.js');
var Orders = require('../service/OrdersService');

module.exports.anyOfOrdersGET = function anyOfOrdersGET (req, res, next, orderId, fetchType) {
  Orders.anyOfOrdersGET(orderId, fetchType)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.deleteOrderDetails = function deleteOrderDetails (req, res, next, orderId) {
  Orders.deleteOrderDetails(orderId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getOrderDetails = function getOrderDetails (req, res, next, orderId) {
  Orders.getOrderDetails(orderId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.oneOfOrdersPOST = function oneOfOrdersPOST (req, res, next, body) {
  Orders.oneOfOrdersPOST(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.saveOrderDetails = function saveOrderDetails (req, res, next, body) {
  Orders.saveOrderDetails(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.updateOrderdetails = function updateOrderdetails (req, res, next, body) {
  Orders.updateOrderdetails(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
