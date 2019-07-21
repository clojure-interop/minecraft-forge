(ns net.minecraft.util.EnumTypeAdapterFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util EnumTypeAdapterFactory]))

(defn ->enum-type-adapter-factory
  "Constructor."
  (^EnumTypeAdapterFactory []
    (new EnumTypeAdapterFactory )))

(defn create
  "p-create-1 - `com.google.gson.Gson`
  p-create-2 - `com.google.gson.reflect.TypeToken`

  returns: `<T> com.google.gson.TypeAdapter<T>`"
  ([^EnumTypeAdapterFactory this ^com.google.gson.Gson p-create-1 ^com.google.gson.reflect.TypeToken p-create-2]
    (-> this (.create p-create-1 p-create-2))))

