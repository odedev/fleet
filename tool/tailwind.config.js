/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{html,hbs}"],
  theme: {
    extend: {},
  },
  plugins: [
    require('daisyui'),
  ],
}

