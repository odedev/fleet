import NProgress from 'nprogress';
import 'nprogress/nprogress.css';

NProgress.configure({
  showSpinner: false,
  easing: 'ease',
  speed: 500,
});

export default NProgress;
