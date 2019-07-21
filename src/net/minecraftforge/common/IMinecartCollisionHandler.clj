(ns net.minecraftforge.common.IMinecartCollisionHandler
  "This class defines a replacement for the default minecart collision code.
  Only one handler can be registered at a time. It it registered with EntityMinecart.registerCollisionHandler().
  If you use this, make it a configuration option."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common IMinecartCollisionHandler]))

(defn on-entity-collision
  "This basically replaces the function of the same name in EntityMinecart.
   Code in IMinecartHooks.applyEntityCollisionHook is still run.

  cart - The cart that called the collision. - `net.minecraft.entity.item.EntityMinecart`
  other - The object it collided with. - `net.minecraft.entity.Entity`"
  ([^IMinecartCollisionHandler this ^net.minecraft.entity.item.EntityMinecart cart ^net.minecraft.entity.Entity other]
    (-> this (.onEntityCollision cart other))))

(defn get-collision-box
  "This function replaced the function of the same name in EntityMinecart.
   It is used to define whether minecarts collide with specific entities,
   for example items.

  cart - The cart for which the collision box was requested. - `net.minecraft.entity.item.EntityMinecart`
  other - The entity requesting the collision box. - `net.minecraft.entity.Entity`

  returns: The collision box or null. - `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^IMinecartCollisionHandler this ^net.minecraft.entity.item.EntityMinecart cart ^net.minecraft.entity.Entity other]
    (-> this (.getCollisionBox cart other))))

(defn get-minecart-collision-box
  "This function is used to define the box used for detecting minecart collisions.
   It is generally bigger that the normal collision box.

  cart - The cart for which the collision box was requested. - `net.minecraft.entity.item.EntityMinecart`

  returns: The collision box, cannot be null. - `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^IMinecartCollisionHandler this ^net.minecraft.entity.item.EntityMinecart cart]
    (-> this (.getMinecartCollisionBox cart))))

(defn get-bounding-box
  "This function replaces the function of the same name in EntityMinecart.
   It defines whether minecarts are solid to the player.

  cart - The cart for which the bounding box was requested. - `net.minecraft.entity.item.EntityMinecart`

  returns: The bounding box or null. - `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^IMinecartCollisionHandler this ^net.minecraft.entity.item.EntityMinecart cart]
    (-> this (.getBoundingBox cart))))

