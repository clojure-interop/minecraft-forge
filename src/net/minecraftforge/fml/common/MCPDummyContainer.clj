(ns net.minecraftforge.fml.common.MCPDummyContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common MCPDummyContainer]))

(defn ->mcp-dummy-container
  "Constructor.

  metadata - `net.minecraftforge.fml.common.ModMetadata`"
  (^MCPDummyContainer [^net.minecraftforge.fml.common.ModMetadata metadata]
    (new MCPDummyContainer metadata)))

(defn register-bus
  "Description copied from interface: ModContainer

  bus - `com.google.common.eventbus.EventBus`
  controller - `net.minecraftforge.fml.common.LoadController`

  returns: `boolean`"
  (^Boolean [^MCPDummyContainer this ^com.google.common.eventbus.EventBus bus ^net.minecraftforge.fml.common.LoadController controller]
    (-> this (.registerBus bus controller))))

(defn can-be-disabled
  "returns: `net.minecraftforge.fml.common.ModContainer$Disableable`"
  (^net.minecraftforge.fml.common.ModContainer$Disableable [^MCPDummyContainer this]
    (-> this (.canBeDisabled))))

