(ns net.minecraftforge.event.world.GetCollisionBoxesEvent
  "This event is fired during World.collidesWithAnyBlock(AxisAlignedBB)
  and before returning the list in World.getCollisionBoxes(Entity, AxisAlignedBB)

  entity contains the entity passed in the World.getCollisionBoxes(Entity, AxisAlignedBB). Can be null. Calls from World.collidesWithAnyBlock(AxisAlignedBB) will be null.
  aabb contains the AxisAlignedBB passed in the method.
  collisionBoxesList contains the list of detected collision boxes intersecting with aabb. The list can be modified.

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world GetCollisionBoxesEvent]))

(defn ->get-collision-boxes-event
  "Constructor.

  world - `net.minecraft.world.World`
  entity - `net.minecraft.entity.Entity`
  aabb - `net.minecraft.util.math.AxisAlignedBB`
  collision-boxes-list - `java.util.List`"
  (^GetCollisionBoxesEvent [^net.minecraft.world.World world ^net.minecraft.entity.Entity entity ^net.minecraft.util.math.AxisAlignedBB aabb ^java.util.List collision-boxes-list]
    (new GetCollisionBoxesEvent world entity aabb collision-boxes-list)))

(defn get-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^GetCollisionBoxesEvent this]
    (-> this (.getEntity))))

(defn get-aabb
  "returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^GetCollisionBoxesEvent this]
    (-> this (.getAabb))))

(defn get-collision-boxes-list
  "returns: `java.util.List<net.minecraft.util.math.AxisAlignedBB>`"
  (^java.util.List [^GetCollisionBoxesEvent this]
    (-> this (.getCollisionBoxesList))))

