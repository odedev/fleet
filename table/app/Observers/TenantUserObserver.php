<?php

namespace App\Observers;

use App\Models\TenantUser;

class TenantUserObserver
{
    /**
     * Handle the TenantUser "created" event.
     */
    public function created(TenantUser $tenantUser): void
    {
        //
    }

    /**
     * Handle the TenantUser "updated" event.
     */
    public function updated(TenantUser $tenantUser): void
    {
        //
    }

    /**
     * Handle the TenantUser "deleted" event.
     */
    public function deleted(TenantUser $tenantUser): void
    {
        //
    }

    /**
     * Handle the TenantUser "restored" event.
     */
    public function restored(TenantUser $tenantUser): void
    {
        //
    }

    /**
     * Handle the TenantUser "force deleted" event.
     */
    public function forceDeleted(TenantUser $tenantUser): void
    {
        //
    }
}
