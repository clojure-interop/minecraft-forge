(ns net.minecraft.potion.Potion
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.potion Potion]))

(def *-registry
  "Static Constant.

  type: net.minecraft.util.registry.RegistryNamespaced<net.minecraft.util.ResourceLocation,net.minecraft.potion.Potion>"
  Potion/REGISTRY)

(defn *get-potion-by-id
  "potion-id - `int`

  returns: `net.minecraft.potion.Potion`"
  (^net.minecraft.potion.Potion [^Integer potion-id]
    (Potion/getPotionById potion-id)))

(defn *get-id-from-potion
  "potion-in - `net.minecraft.potion.Potion`

  returns: `int`"
  (^Integer [^net.minecraft.potion.Potion potion-in]
    (Potion/getIdFromPotion potion-in)))

(defn *get-potion-from-resource-location
  "location - `java.lang.String`

  returns: `net.minecraft.potion.Potion`"
  (^net.minecraft.potion.Potion [^java.lang.String location]
    (Potion/getPotionFromResourceLocation location)))

(defn *get-potion-duration-string
  "p-188410-0 - `net.minecraft.potion.PotionEffect`
  p-188410-1 - `float`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraft.potion.PotionEffect p-188410-0 ^Float p-188410-1]
    (Potion/getPotionDurationString p-188410-0 p-188410-1)))

(defn *register-potions
  ""
  ([]
    (Potion/registerPotions )))

(defn affect-entity
  "source - `net.minecraft.entity.Entity`
  indirect-source - `net.minecraft.entity.Entity`
  entity-living-base-in - `net.minecraft.entity.EntityLivingBase`
  amplifier - `int`
  health - `double`"
  ([^Potion this ^net.minecraft.entity.Entity source ^net.minecraft.entity.Entity indirect-source ^net.minecraft.entity.EntityLivingBase entity-living-base-in ^Integer amplifier ^Double health]
    (-> this (.affectEntity source indirect-source entity-living-base-in amplifier health))))

(defn remove-attributes-modifiers-from-entity
  "entity-living-base-in - `net.minecraft.entity.EntityLivingBase`
  attribute-map-in - `net.minecraft.entity.ai.attributes.AbstractAttributeMap`
  amplifier - `int`"
  ([^Potion this ^net.minecraft.entity.EntityLivingBase entity-living-base-in ^net.minecraft.entity.ai.attributes.AbstractAttributeMap attribute-map-in ^Integer amplifier]
    (-> this (.removeAttributesModifiersFromEntity entity-living-base-in attribute-map-in amplifier))))

(defn bad-effect?
  "returns: `boolean`"
  (^Boolean [^Potion this]
    (-> this (.isBadEffect))))

(defn should-render?
  "If the Potion effect should be displayed in the players inventory

  effect - the active PotionEffect - `net.minecraft.potion.PotionEffect`

  returns: true to display it (default), false to hide it. - `boolean`"
  (^Boolean [^Potion this ^net.minecraft.potion.PotionEffect effect]
    (-> this (.shouldRender effect))))

(defn set-potion-name
  "name-in - `java.lang.String`

  returns: `net.minecraft.potion.Potion`"
  (^net.minecraft.potion.Potion [^Potion this ^java.lang.String name-in]
    (-> this (.setPotionName name-in))))

(defn has-status-icon?
  "returns: `boolean`"
  (^Boolean [^Potion this]
    (-> this (.hasStatusIcon))))

(defn should-render-inv-text?
  "If the standard PotionEffect text (name and duration) should be drawn when this potion is active.

  effect - the active PotionEffect - `net.minecraft.potion.PotionEffect`

  returns: true to draw the standard text - `boolean`"
  (^Boolean [^Potion this ^net.minecraft.potion.PotionEffect effect]
    (-> this (.shouldRenderInvText effect))))

(defn get-status-icon-index
  "returns: `int`"
  (^Integer [^Potion this]
    (-> this (.getStatusIconIndex))))

(defn instant?
  "returns: `boolean`"
  (^Boolean [^Potion this]
    (-> this (.isInstant))))

(defn render-inventory-effect
  "Called to draw the this Potion onto the player's inventory when it's active.
   This can be used to e.g. render Potion icons from your own texture.

  x - the x coordinate - `int`
  y - the y coordinate - `int`
  effect - the active PotionEffect - `net.minecraft.potion.PotionEffect`
  mc - the Minecraft instance, for convenience - `net.minecraft.client.Minecraft`"
  ([^Potion this ^Integer x ^Integer y ^net.minecraft.potion.PotionEffect effect ^net.minecraft.client.Minecraft mc]
    (-> this (.renderInventoryEffect x y effect mc))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Potion this]
    (-> this (.getName))))

(defn should-render-hud?
  "If the Potion effect should be displayed in the player's ingame HUD

  effect - the active PotionEffect - `net.minecraft.potion.PotionEffect`

  returns: true to display it (default), false to hide it. - `boolean`"
  (^Boolean [^Potion this ^net.minecraft.potion.PotionEffect effect]
    (-> this (.shouldRenderHUD effect))))

(defn render-hud-effect
  "Called to draw the this Potion onto the player's ingame HUD when it's active.
   This can be used to e.g. render Potion icons from your own texture.

  x - the x coordinate - `int`
  y - the y coordinate - `int`
  effect - the active PotionEffect - `net.minecraft.potion.PotionEffect`
  mc - the Minecraft instance, for convenience - `net.minecraft.client.Minecraft`
  alpha - the alpha value, blinks when the potion is about to run out - `float`"
  ([^Potion this ^Integer x ^Integer y ^net.minecraft.potion.PotionEffect effect ^net.minecraft.client.Minecraft mc ^Float alpha]
    (-> this (.renderHUDEffect x y effect mc alpha))))

(defn set-beneficial
  "returns: `net.minecraft.potion.Potion`"
  (^net.minecraft.potion.Potion [^Potion this]
    (-> this (.setBeneficial))))

(defn apply-attributes-modifiers-to-entity
  "entity-living-base-in - `net.minecraft.entity.EntityLivingBase`
  attribute-map-in - `net.minecraft.entity.ai.attributes.AbstractAttributeMap`
  amplifier - `int`"
  ([^Potion this ^net.minecraft.entity.EntityLivingBase entity-living-base-in ^net.minecraft.entity.ai.attributes.AbstractAttributeMap attribute-map-in ^Integer amplifier]
    (-> this (.applyAttributesModifiersToEntity entity-living-base-in attribute-map-in amplifier))))

(defn get-liquid-color
  "returns: `int`"
  (^Integer [^Potion this]
    (-> this (.getLiquidColor))))

(defn get-attribute-modifier-amount
  "amplifier - `int`
  modifier - `net.minecraft.entity.ai.attributes.AttributeModifier`

  returns: `double`"
  (^Double [^Potion this ^Integer amplifier ^net.minecraft.entity.ai.attributes.AttributeModifier modifier]
    (-> this (.getAttributeModifierAmount amplifier modifier))))

(defn perform-effect
  "entity-living-base-in - `net.minecraft.entity.EntityLivingBase`
  p-76394-2 - `int`"
  ([^Potion this ^net.minecraft.entity.EntityLivingBase entity-living-base-in ^Integer p-76394-2]
    (-> this (.performEffect entity-living-base-in p-76394-2))))

(defn register-potion-attribute-modifier
  "attribute - `net.minecraft.entity.ai.attributes.IAttribute`
  unique-id - `java.lang.String`
  ammount - `double`
  operation - `int`

  returns: `net.minecraft.potion.Potion`"
  (^net.minecraft.potion.Potion [^Potion this ^net.minecraft.entity.ai.attributes.IAttribute attribute ^java.lang.String unique-id ^Double ammount ^Integer operation]
    (-> this (.registerPotionAttributeModifier attribute unique-id ammount operation))))

(defn get-attribute-modifier-map
  "returns: `java.util.Map<net.minecraft.entity.ai.attributes.IAttribute,net.minecraft.entity.ai.attributes.AttributeModifier>`"
  (^java.util.Map [^Potion this]
    (-> this (.getAttributeModifierMap))))

(defn beneficial?
  "returns: `boolean`"
  (^Boolean [^Potion this]
    (-> this (.isBeneficial))))

(defn ready?
  "duration - `int`
  amplifier - `int`

  returns: `boolean`"
  (^Boolean [^Potion this ^Integer duration ^Integer amplifier]
    (-> this (.isReady duration amplifier))))

