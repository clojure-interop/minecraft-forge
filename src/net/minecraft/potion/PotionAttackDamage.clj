(ns net.minecraft.potion.PotionAttackDamage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.potion PotionAttackDamage]))

(defn get-attribute-modifier-amount
  "amplifier - `int`
  modifier - `net.minecraft.entity.ai.attributes.AttributeModifier`

  returns: `double`"
  (^Double [^PotionAttackDamage this ^Integer amplifier ^net.minecraft.entity.ai.attributes.AttributeModifier modifier]
    (-> this (.getAttributeModifierAmount amplifier modifier))))

