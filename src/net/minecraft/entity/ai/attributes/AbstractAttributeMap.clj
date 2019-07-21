(ns net.minecraft.entity.ai.attributes.AbstractAttributeMap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai.attributes AbstractAttributeMap]))

(defn ->abstract-attribute-map
  "Constructor."
  (^AbstractAttributeMap []
    (new AbstractAttributeMap )))

(defn get-attribute-instance
  "attribute - `net.minecraft.entity.ai.attributes.IAttribute`

  returns: `net.minecraft.entity.ai.attributes.IAttributeInstance`"
  (^net.minecraft.entity.ai.attributes.IAttributeInstance [^AbstractAttributeMap this ^net.minecraft.entity.ai.attributes.IAttribute attribute]
    (-> this (.getAttributeInstance attribute))))

(defn get-attribute-instance-by-name
  "attribute-name - `java.lang.String`

  returns: `net.minecraft.entity.ai.attributes.IAttributeInstance`"
  (^net.minecraft.entity.ai.attributes.IAttributeInstance [^AbstractAttributeMap this ^java.lang.String attribute-name]
    (-> this (.getAttributeInstanceByName attribute-name))))

(defn register-attribute
  "attribute - `net.minecraft.entity.ai.attributes.IAttribute`

  returns: `net.minecraft.entity.ai.attributes.IAttributeInstance`"
  (^net.minecraft.entity.ai.attributes.IAttributeInstance [^AbstractAttributeMap this ^net.minecraft.entity.ai.attributes.IAttribute attribute]
    (-> this (.registerAttribute attribute))))

(defn get-all-attributes
  "returns: `java.util.Collection<net.minecraft.entity.ai.attributes.IAttributeInstance>`"
  (^java.util.Collection [^AbstractAttributeMap this]
    (-> this (.getAllAttributes))))

(defn on-attribute-modified
  "instance - `net.minecraft.entity.ai.attributes.IAttributeInstance`"
  ([^AbstractAttributeMap this ^net.minecraft.entity.ai.attributes.IAttributeInstance instance]
    (-> this (.onAttributeModified instance))))

(defn remove-attribute-modifiers
  "modifiers - `com.google.common.collect.Multimap`"
  ([^AbstractAttributeMap this ^com.google.common.collect.Multimap modifiers]
    (-> this (.removeAttributeModifiers modifiers))))

(defn apply-attribute-modifiers
  "modifiers - `com.google.common.collect.Multimap`"
  ([^AbstractAttributeMap this ^com.google.common.collect.Multimap modifiers]
    (-> this (.applyAttributeModifiers modifiers))))

