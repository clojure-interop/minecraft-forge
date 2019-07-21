(ns net.minecraftforge.event.entity.living.PotionColorCalculationEvent
  "Fires after Potion Color Calculation.

  this event is not Cancelable

  This event is fired on the MinecraftForge#EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living PotionColorCalculationEvent]))

(defn ->potion-color-calculation-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  color - `int`
  hide-particle - `boolean`
  effect-list - `java.util.Collection`"
  (^PotionColorCalculationEvent [^net.minecraft.entity.EntityLivingBase entity ^Integer color ^Boolean hide-particle ^java.util.Collection effect-list]
    (new PotionColorCalculationEvent entity color hide-particle effect-list)))

(defn get-color
  "returns: `int`"
  (^Integer [^PotionColorCalculationEvent this]
    (-> this (.getColor))))

(defn set-color
  "color - `int`"
  ([^PotionColorCalculationEvent this ^Integer color]
    (-> this (.setColor color))))

(defn are-particles-hidden
  "returns: `boolean`"
  (^Boolean [^PotionColorCalculationEvent this]
    (-> this (.areParticlesHidden))))

(defn should-hide-particles
  "hide-particle - `boolean`"
  ([^PotionColorCalculationEvent this ^Boolean hide-particle]
    (-> this (.shouldHideParticles hide-particle))))

(defn get-effects
  "Note that returned list is unmodifiable.

  returns: effects - `java.util.Collection<net.minecraft.potion.PotionEffect>`"
  (^java.util.Collection [^PotionColorCalculationEvent this]
    (-> this (.getEffects))))

