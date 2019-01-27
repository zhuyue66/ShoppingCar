protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/json; charset=utf-8");
        PrintWriter out = response.getWriter();
        JSONObject object = new JSONObject();
        object.put("name", "zhuda");
        object.put("age", "21");

        List<JSONObject> list = new ArrayList<JSONObject>();
        int i = 5;
        while (i > 0) {
            JSONObject list1 = new JSONObject();
            list1.put("location", "大理");
            list1.put("class", "软工1601");
            list.add(list1);
            i--;
        }
        JSONArray array = new JSONArray(list);
        object.put("info", array);

        out.print(object);
    }