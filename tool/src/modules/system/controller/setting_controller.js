

async function settingView(req, res) {
  res.render('system/setting', { title: 'Fleet setting' });
}


export default {
  settingView,
}
