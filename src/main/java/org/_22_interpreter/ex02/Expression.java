package org._22_interpreter.ex02;

import java.util.List;
import java.util.Map;

// Abstract Expression
interface Expression {
    List<Map<String, String>> interpret(Context context);
}