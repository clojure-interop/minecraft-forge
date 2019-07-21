(ns net.minecraft.util.text.ITextComponent$Serializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text ITextComponent$Serializer]))

(defn ->serializer
  "Constructor."
  (^ITextComponent$Serializer []
    (new ITextComponent$Serializer )))

(defn *component-to-json
  "component - `net.minecraft.util.text.ITextComponent`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraft.util.text.ITextComponent component]
    (ITextComponent$Serializer/componentToJson component)))

(defn *json-to-component
  "json - `java.lang.String`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^java.lang.String json]
    (ITextComponent$Serializer/jsonToComponent json)))

(defn *from-json-lenient
  "json - `java.lang.String`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^java.lang.String json]
    (ITextComponent$Serializer/fromJsonLenient json)))

(defn deserialize
  "p-deserialize-1 - `com.google.gson.JsonElement`
  p-deserialize-2 - `java.lang.reflect.Type`
  p-deserialize-3 - `com.google.gson.JsonDeserializationContext`

  returns: `net.minecraft.util.text.ITextComponent`

  throws: com.google.gson.JsonParseException"
  (^net.minecraft.util.text.ITextComponent [^ITextComponent$Serializer this ^com.google.gson.JsonElement p-deserialize-1 ^java.lang.reflect.Type p-deserialize-2 ^com.google.gson.JsonDeserializationContext p-deserialize-3]
    (-> this (.deserialize p-deserialize-1 p-deserialize-2 p-deserialize-3))))

(defn serialize
  "p-serialize-1 - `net.minecraft.util.text.ITextComponent`
  p-serialize-2 - `java.lang.reflect.Type`
  p-serialize-3 - `com.google.gson.JsonSerializationContext`

  returns: `com.google.gson.JsonElement`"
  (^com.google.gson.JsonElement [^ITextComponent$Serializer this ^net.minecraft.util.text.ITextComponent p-serialize-1 ^java.lang.reflect.Type p-serialize-2 ^com.google.gson.JsonSerializationContext p-serialize-3]
    (-> this (.serialize p-serialize-1 p-serialize-2 p-serialize-3))))

