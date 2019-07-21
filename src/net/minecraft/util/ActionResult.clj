(ns net.minecraft.util.ActionResult
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util ActionResult]))

(defn ->action-result
  "Constructor.

  type-in - `net.minecraft.util.EnumActionResult`
  result-in - `T`"
  (^ActionResult [^net.minecraft.util.EnumActionResult type-in result-in]
    (new ActionResult type-in result-in)))

(defn *new-result
  "result - `net.minecraft.util.EnumActionResult`
  value - `T`

  returns: `<T> net.minecraft.util.ActionResult<T>`"
  ([^net.minecraft.util.EnumActionResult result value]
    (ActionResult/newResult result value)))

(defn get-type
  "returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^ActionResult this]
    (-> this (.getType))))

(defn get-result
  "returns: `T`"
  ([^ActionResult this]
    (-> this (.getResult))))

