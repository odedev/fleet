import express from 'express';
import system from "./system/router.js";

const router = express.Router();

router.use(system);

router.get('/', function(req, res, next) {
  res.render('index', { title: 'Fleet Tool' });
});

// router.get('/user', function(req, res, next) {
//   res.render('system/user', { title: 'Fleet user' });
// });

// router.get('/setting', function(req, res, next) {
//   res.render('system/setting', { title: 'Fleet setting' });
// });

export default router;
