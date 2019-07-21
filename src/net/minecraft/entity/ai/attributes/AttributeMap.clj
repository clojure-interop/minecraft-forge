(ns net.minecraft.entity.ai.attributes.AttributeMap
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai.attributes AttributeMap]))

(defn ->attribute-map
  "Constructor."
  (^AttributeMap []
    (new AttributeMap )))

(defn get-attribute-instance
  "attribute - `net.minecraft.entity.ai.attributes.IAttribute`

  returns: `net.minecraft.entity.ai.attributes.ModifiableAttributeInstance`"
  (^net.minecraft.entity.ai.attributes.ModifiableAttributeInstance [^AttributeMap this ^net.minecraft.entity.ai.attributes.IAttribute attribute]
    (-> this (.getAttributeInstance attribute))))

(defn get-attribute-instance-by-name
  "attribute-name - `java.lang.String`

  returns: `net.minecraft.entity.ai.attributes.ModifiableAttributeInstance`"
  (^net.minecraft.entity.ai.attributes.ModifiableAttributeInstance [^AttributeMap this ^java.lang.String attribute-name]
    (-> this (.getAttributeInstanceByName attribute-name))))

(defn register-attribute
  "attribute - `net.minecraft.entity.ai.attributes.IAttribute`

  returns: `net.minecraft.entity.ai.attributes.IAttributeInstance`"
  (^net.minecraft.entity.ai.attributes.IAttributeInstance [^AttributeMap this ^net.minecraft.entity.ai.attributes.IAttribute attribute]
    (-> this (.registerAttribute attribute))))

(defn on-attribute-modified
  "instance - `net.minecraft.entity.ai.attributes.IAttributeInstance`"
  ([^AttributeMap this ^net.minecraft.entity.ai.attributes.IAttributeInstance instance]
    (-> this (.onAttributeModified instance))))

(defn get-attribute-instance-set
  "returns: `java.util.Set<net.minecraft.entity.ai.attributes.IAttributeInstance>`"
  (^java.util.Set [^AttributeMap this]
    (-> this (.getAttributeInstanceSet))))

(defn get-watched-attributes
  "returns: `java.util.Collection<net.minecraft.entity.ai.attributes.IAttributeInstance>`"
  (^java.util.Collection [^AttributeMap this]
    (-> this (.getWatchedAttributes))))

