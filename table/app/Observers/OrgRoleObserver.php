<?php

namespace App\Observers;

use App\Models\OrgRole;

class OrgRoleObserver
{
    /**
     * Handle the OrgRole "created" event.
     */
    public function created(OrgRole $orgRole): void
    {
        //
    }

    /**
     * Handle the OrgRole "updated" event.
     */
    public function updated(OrgRole $orgRole): void
    {
        //
    }

    /**
     * Handle the OrgRole "deleted" event.
     */
    public function deleted(OrgRole $orgRole): void
    {
        //
    }

    /**
     * Handle the OrgRole "restored" event.
     */
    public function restored(OrgRole $orgRole): void
    {
        //
    }

    /**
     * Handle the OrgRole "force deleted" event.
     */
    public function forceDeleted(OrgRole $orgRole): void
    {
        //
    }
}
