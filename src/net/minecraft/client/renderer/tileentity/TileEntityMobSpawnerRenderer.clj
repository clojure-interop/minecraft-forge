(ns net.minecraft.client.renderer.tileentity.TileEntityMobSpawnerRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.tileentity TileEntityMobSpawnerRenderer]))

(defn ->tile-entity-mob-spawner-renderer
  "Constructor."
  (^TileEntityMobSpawnerRenderer []
    (new TileEntityMobSpawnerRenderer )))

(defn *render-mob
  "mob-spawner-logic - `net.minecraft.tileentity.MobSpawnerBaseLogic`
  pos-x - `double`
  pos-y - `double`
  pos-z - `double`
  partial-ticks - `float`"
  ([^net.minecraft.tileentity.MobSpawnerBaseLogic mob-spawner-logic ^Double pos-x ^Double pos-y ^Double pos-z ^Float partial-ticks]
    (TileEntityMobSpawnerRenderer/renderMob mob-spawner-logic pos-x pos-y pos-z partial-ticks)))

(defn render-tile-entity-at
  "te - `net.minecraft.tileentity.TileEntityMobSpawner`
  x - `double`
  y - `double`
  z - `double`
  partial-ticks - `float`
  destroy-stage - `int`"
  ([^TileEntityMobSpawnerRenderer this ^net.minecraft.tileentity.TileEntityMobSpawner te ^Double x ^Double y ^Double z ^Float partial-ticks ^Integer destroy-stage]
    (-> this (.renderTileEntityAt te x y z partial-ticks destroy-stage))))

