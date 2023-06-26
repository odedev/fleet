import express from 'express';

const router = express.Router();

router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

router.get('/setting', function(req, res, next) {
  res.render('system/setting', { title: 'Fleet setting' });
});

export default router;
