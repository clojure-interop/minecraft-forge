(ns net.minecraft.potion.PotionHealthBoost
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.potion PotionHealthBoost]))

(defn ->potion-health-boost
  "Constructor.

  is-bad-effect-in - `boolean`
  liquid-color-in - `int`"
  (^PotionHealthBoost [^Boolean is-bad-effect-in ^Integer liquid-color-in]
    (new PotionHealthBoost is-bad-effect-in liquid-color-in)))

(defn remove-attributes-modifiers-from-entity
  "entity-living-base-in - `net.minecraft.entity.EntityLivingBase`
  attribute-map-in - `net.minecraft.entity.ai.attributes.AbstractAttributeMap`
  amplifier - `int`"
  ([^PotionHealthBoost this ^net.minecraft.entity.EntityLivingBase entity-living-base-in ^net.minecraft.entity.ai.attributes.AbstractAttributeMap attribute-map-in ^Integer amplifier]
    (-> this (.removeAttributesModifiersFromEntity entity-living-base-in attribute-map-in amplifier))))

