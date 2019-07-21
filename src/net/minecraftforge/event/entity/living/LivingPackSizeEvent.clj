(ns net.minecraftforge.event.entity.living.LivingPackSizeEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingPackSizeEvent]))

(defn ->living-pack-size-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLiving`"
  (^LivingPackSizeEvent [^net.minecraft.entity.EntityLiving entity]
    (new LivingPackSizeEvent entity)))

(defn get-max-pack-size
  "This event is fired when the spawning system determines the
   maximum amount of the selected entity that can spawn at the same
   time.

   If you set the result to 'ALLOW', it means that you want to return
   the value of maxPackSize as the maximum pack size for current entity.

  returns: `int`"
  (^Integer [^LivingPackSizeEvent this]
    (-> this (.getMaxPackSize))))

(defn set-max-pack-size
  "max-pack-size - `int`"
  ([^LivingPackSizeEvent this ^Integer max-pack-size]
    (-> this (.setMaxPackSize max-pack-size))))

