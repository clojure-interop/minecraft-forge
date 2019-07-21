(ns net.minecraft.entity.projectile.EntityShulkerBullet
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.projectile EntityShulkerBullet]))

(defn ->entity-shulker-bullet
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  motion-x-in - `double`
  motion-y-in - `double`
  motion-z-in - `double`"
  (^EntityShulkerBullet [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^Double motion-x-in ^Double motion-y-in ^Double motion-z-in]
    (new EntityShulkerBullet world-in x y z motion-x-in motion-y-in motion-z-in))
  (^EntityShulkerBullet [^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase owner-in ^net.minecraft.entity.Entity target-in ^net.minecraft.util.EnumFacing$Axis p-i-46772-4]
    (new EntityShulkerBullet world-in owner-in target-in p-i-46772-4))
  (^EntityShulkerBullet [^net.minecraft.world.World world-in]
    (new EntityShulkerBullet world-in)))

(defn get-sound-category
  "returns: `net.minecraft.util.SoundCategory`"
  (^net.minecraft.util.SoundCategory [^EntityShulkerBullet this]
    (-> this (.getSoundCategory))))

(defn on-update
  ""
  ([^EntityShulkerBullet this]
    (-> this (.onUpdate))))

(defn burning?
  "returns: `boolean`"
  (^Boolean [^EntityShulkerBullet this]
    (-> this (.isBurning))))

(defn in-range-to-render-dist?
  "distance - `double`

  returns: `boolean`"
  (^Boolean [^EntityShulkerBullet this ^Double distance]
    (-> this (.isInRangeToRenderDist distance))))

(defn get-brightness
  "partial-ticks - `float`

  returns: `float`"
  (^Float [^EntityShulkerBullet this ^Float partial-ticks]
    (-> this (.getBrightness partial-ticks))))

(defn get-brightness-for-render
  "partial-ticks - `float`

  returns: `int`"
  (^Integer [^EntityShulkerBullet this ^Float partial-ticks]
    (-> this (.getBrightnessForRender partial-ticks))))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^EntityShulkerBullet this]
    (-> this (.canBeCollidedWith))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityShulkerBullet this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

