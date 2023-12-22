<?php

namespace App\Observers;

use App\Models\TenantRole;

class TenantRoleObserver
{
    /**
     * Handle the TenantRole "created" event.
     */
    public function created(TenantRole $tenantRole): void
    {
        //
    }

    /**
     * Handle the TenantRole "updated" event.
     */
    public function updated(TenantRole $tenantRole): void
    {
        //
    }

    /**
     * Handle the TenantRole "deleted" event.
     */
    public function deleted(TenantRole $tenantRole): void
    {
        //
    }

    /**
     * Handle the TenantRole "restored" event.
     */
    public function restored(TenantRole $tenantRole): void
    {
        //
    }

    /**
     * Handle the TenantRole "force deleted" event.
     */
    public function forceDeleted(TenantRole $tenantRole): void
    {
        //
    }
}
