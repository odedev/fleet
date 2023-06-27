import express from 'express';

const router = express.Router();

router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

router.get('/user', function(req, res, next) {
  res.render('system/user', { title: 'Fleet user' });
});

router.get('/setting', function(req, res, next) {
  res.render('system/setting', { title: 'Fleet setting' });
});

export default router;
