import express from 'express';

const router = express.Router();

router.get('/system/user', function(req, res, next) {
  res.render('system/user', { title: 'Fleet user' });
})
router.get('/system/setting', function(req, res, next) {
  res.render('system/setting', { title: 'Fleet setting' });
});

export default router;
