(ns net.minecraftforge.server.permission.IPermissionHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.permission IPermissionHandler]))

(defn register-node
  "Use PermissionAPI.registerNode(String, DefaultPermissionLevel, String)

  node - `java.lang.String`
  level - `net.minecraftforge.server.permission.DefaultPermissionLevel`
  desc - `java.lang.String`"
  ([^IPermissionHandler this ^java.lang.String node ^net.minecraftforge.server.permission.DefaultPermissionLevel level ^java.lang.String desc]
    (-> this (.registerNode node level desc))))

(defn get-registered-nodes
  "returns: Immutable collection of all registered nodes - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^IPermissionHandler this]
    (-> this (.getRegisteredNodes))))

(defn has-permission?
  "Use PermissionAPI.hasPermission(GameProfile, String, IContext)

  profile - `com.mojang.authlib.GameProfile`
  node - `java.lang.String`
  context - `net.minecraftforge.server.permission.context.IContext`

  returns: `boolean`"
  (^Boolean [^IPermissionHandler this ^com.mojang.authlib.GameProfile profile ^java.lang.String node ^net.minecraftforge.server.permission.context.IContext context]
    (-> this (.hasPermission profile node context))))

(defn get-node-description
  "node - Permission node - `java.lang.String`

  returns: Description of the node. \"\" in case this node doesn't have a decription - `java.lang.String`"
  (^java.lang.String [^IPermissionHandler this ^java.lang.String node]
    (-> this (.getNodeDescription node))))

