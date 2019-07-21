(ns net.minecraft.potion.PotionAbsorption
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.potion PotionAbsorption]))

(defn remove-attributes-modifiers-from-entity
  "entity-living-base-in - `net.minecraft.entity.EntityLivingBase`
  attribute-map-in - `net.minecraft.entity.ai.attributes.AbstractAttributeMap`
  amplifier - `int`"
  ([^PotionAbsorption this ^net.minecraft.entity.EntityLivingBase entity-living-base-in ^net.minecraft.entity.ai.attributes.AbstractAttributeMap attribute-map-in ^Integer amplifier]
    (-> this (.removeAttributesModifiersFromEntity entity-living-base-in attribute-map-in amplifier))))

(defn apply-attributes-modifiers-to-entity
  "entity-living-base-in - `net.minecraft.entity.EntityLivingBase`
  attribute-map-in - `net.minecraft.entity.ai.attributes.AbstractAttributeMap`
  amplifier - `int`"
  ([^PotionAbsorption this ^net.minecraft.entity.EntityLivingBase entity-living-base-in ^net.minecraft.entity.ai.attributes.AbstractAttributeMap attribute-map-in ^Integer amplifier]
    (-> this (.applyAttributesModifiersToEntity entity-living-base-in attribute-map-in amplifier))))

