(ns net.minecraftforge.fml.client.IModGuiFactory$RuntimeOptionCategoryElement
  "Represents an option category and entry in the runtime gui options list."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client IModGuiFactory$RuntimeOptionCategoryElement]))

(defn ->runtime-option-category-element
  "Constructor.

  parent - `java.lang.String`
  child - `java.lang.String`"
  (^IModGuiFactory$RuntimeOptionCategoryElement [^java.lang.String parent ^java.lang.String child]
    (new IModGuiFactory$RuntimeOptionCategoryElement parent child)))

(defn parent
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^IModGuiFactory$RuntimeOptionCategoryElement this]
    (-> this .-parent)))

(defn child
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^IModGuiFactory$RuntimeOptionCategoryElement this]
    (-> this .-child)))

