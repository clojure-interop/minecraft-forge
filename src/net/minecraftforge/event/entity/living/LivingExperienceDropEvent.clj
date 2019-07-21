(ns net.minecraftforge.event.entity.living.LivingExperienceDropEvent
  "Event for when an entity drops experience on its death, can be used to change
  the amount of experience points dropped or completely prevent dropping of experience
  by canceling the event."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingExperienceDropEvent]))

(defn ->living-experience-drop-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  attacking-player - `net.minecraft.entity.player.EntityPlayer`
  original-experience - `int`"
  (^LivingExperienceDropEvent [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.entity.player.EntityPlayer attacking-player ^Integer original-experience]
    (new LivingExperienceDropEvent entity attacking-player original-experience)))

(defn get-dropped-experience
  "returns: `int`"
  (^Integer [^LivingExperienceDropEvent this]
    (-> this (.getDroppedExperience))))

(defn set-dropped-experience
  "dropped-experience - `int`"
  ([^LivingExperienceDropEvent this ^Integer dropped-experience]
    (-> this (.setDroppedExperience dropped-experience))))

(defn get-attacking-player
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^LivingExperienceDropEvent this]
    (-> this (.getAttackingPlayer))))

(defn get-original-experience
  "returns: `int`"
  (^Integer [^LivingExperienceDropEvent this]
    (-> this (.getOriginalExperience))))

