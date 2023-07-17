import axios from 'axios'
import qs from 'qs'

const instance = axios.create({
  baseURL: '',
  timeout: 1800000,  // 1000*60*30
  headers: {'Authorization': ''}
});

instance.interceptors.request.use(function (config) {
  // 在发送请求之前做些什么
  return config;
}, function (error) {
  // 对请求错误做些什么
  return Promise.reject(error);
});

// 添加响应拦截器
instance.interceptors.response.use(function (response) {
  // 2xx 范围内的状态码都会触发该函数。
  return response;
}, function (error) {
  // 超出 2xx 范围的状态码都会触发该函数。
  return Promise.reject(error);
});

const request = {

  async get(url: string, params: any) {
    if (params) {
      url = url + '?' + qs.stringify(params)
    }
    try {
      let res = await instance.get(url, params)
      return res.data
    } catch (err: any) {
      throw err.response.data
    }
  },

  async post(url: string, params: any) {
    try {
      let res = await instance.post(url, params)
      return res.data
    } catch (err: any) {
      throw err.response.data
    }
  },

  async postFormData(url: string, params: any) {
    const config = {
      transformRequest: function (data: any, headers: any) {
        let formData = new FormData()
        Object.keys(data).forEach(key => {
          let value = data[key]
          formData.append(key, value)
        })
        return formData
      },
    }
    try {
      let res = await instance.post(url, params, config)
      return res.data
    } catch (err: any) {
      throw err.response.data
    }
  },

  async postFormUrlencoded(url: string, params: any) {
    const config = {
      headers: {
        'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'
      },
      transformRequest: function (data: any, headers: any) {
        return qs.stringify(data, {arrayFormat: 'brackets'})
      },
    }
    try {
      let res = await instance.post(url, params, config)
      return res.data
    } catch (err: any) {
      throw err.response?.data || err
    }
  },

  async put(url: string, params: any) {
    try {
      let res = await instance.put(url, params)
      return res.data
    } catch (err: any) {
      throw err.response.data
    }
  },

  async putForm(url: string, params: any) {
    try {
      let res = await instance.putForm(url, params)
      return res.data
    } catch (err: any) {
      throw err.response.data
    }
  },

  async patch(url: string, params: any) {
    try {
      let res = await instance.patch(url, params)
      return res.data
    } catch (err: any) {
      throw err.response.data
    }
  },

  async patchForm(url: string, params: any) {
    try {
      let res = await instance.patchForm(url, params)
      return res.data
    } catch (err: any) {
      throw err.response.data
    }
  },

  async delete(url: string, params: any) {
    try {
      let res = await instance.delete(url, params)
      return res.data
    } catch (err: any) {
      throw err.response.data
    }
  },
};

export default request;
