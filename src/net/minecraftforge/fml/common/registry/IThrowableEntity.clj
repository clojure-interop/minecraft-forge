(ns net.minecraftforge.fml.common.registry.IThrowableEntity
  "This interface should be implemented by an Entity that can be 'thrown', like snowballs.
  This was created to mimic ModLoaderMP's 'owner' functionality."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.registry IThrowableEntity]))

(defn get-thrower
  "Gets the entity that threw/created this entity.

  returns: The owner instance, Null if none. - `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^IThrowableEntity this]
    (-> this (.getThrower))))

(defn set-thrower
  "Sets the entity that threw/created this entity.

  entity - The new thrower/creator. - `net.minecraft.entity.Entity`"
  ([^IThrowableEntity this ^net.minecraft.entity.Entity entity]
    (-> this (.setThrower entity))))

