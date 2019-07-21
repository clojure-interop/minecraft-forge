(ns net.minecraftforge.fml.relauncher.FMLSecurityManager
  "A custom security manager stopping certain events from happening
  unexpectedly."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher FMLSecurityManager]))

(defn ->fml-security-manager
  "Constructor."
  (^FMLSecurityManager []
    (new FMLSecurityManager )))

(defn check-permission
  "perm - `java.security.Permission`
  context - `java.lang.Object`"
  ([^FMLSecurityManager this ^java.security.Permission perm ^java.lang.Object context]
    (-> this (.checkPermission perm context)))
  ([^FMLSecurityManager this ^java.security.Permission perm]
    (-> this (.checkPermission perm))))

