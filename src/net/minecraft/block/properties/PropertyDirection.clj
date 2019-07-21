(ns net.minecraft.block.properties.PropertyDirection
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.properties PropertyDirection]))

(defn *create
  "name - `java.lang.String`
  filter - `com.google.common.base.Predicate`

  returns: `net.minecraft.block.properties.PropertyDirection`"
  (^net.minecraft.block.properties.PropertyDirection [^java.lang.String name ^com.google.common.base.Predicate filter]
    (PropertyDirection/create name filter))
  (^net.minecraft.block.properties.PropertyDirection [^java.lang.String name]
    (PropertyDirection/create name)))

