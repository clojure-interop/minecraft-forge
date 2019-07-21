(ns net.minecraftforge.event.entity.player.PlayerInteractEvent$EntityInteractSpecific
  "This event is fired on both sides whenever a player right clicks an entity.

  \"Interact at\" is an interact where the local vector (which part of the entity you clicked) is known.
  The state of this event affects whether Entity.applyPlayerInteraction(net.minecraft.entity.player.EntityPlayer, net.minecraft.util.math.Vec3d, net.minecraft.util.EnumHand) is called.
  If Entity.applyPlayerInteraction(net.minecraft.entity.player.EntityPlayer, net.minecraft.util.math.Vec3d, net.minecraft.util.EnumHand) returns EnumActionResult.SUCCESS, then processing ends.
  Otherwise processing will continue to PlayerInteractEvent.EntityInteract

  Canceling the event clientside will cause processing to continue to PlayerInteractEvent.EntityInteract,
  while canceling serverside will simply do no further processing."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerInteractEvent$EntityInteractSpecific]))

(defn ->entity-interact-specific
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`
  target - `net.minecraft.entity.Entity`
  local-pos - `net.minecraft.util.math.Vec3d`"
  (^PlayerInteractEvent$EntityInteractSpecific [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand ^net.minecraft.entity.Entity target ^net.minecraft.util.math.Vec3d local-pos]
    (new PlayerInteractEvent$EntityInteractSpecific player hand target local-pos)))

(defn get-local-pos
  "Returns the local interaction position. This is a 3D vector, where (0, 0, 0) is centered exactly at the
   center of the entity's bounding box at their feet. This means the X and Z values will be in the range
   [-width / 2, width / 2] while Y values will be in the range [0, height]

  returns: The local position - `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^PlayerInteractEvent$EntityInteractSpecific this]
    (-> this (.getLocalPos))))

(defn get-target
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^PlayerInteractEvent$EntityInteractSpecific this]
    (-> this (.getTarget))))

