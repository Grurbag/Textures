// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelGrailKnightHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer shield_r1;
	private final ModelRenderer head_r1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone2;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Head_r3;
	private final ModelRenderer bone;
	private final ModelRenderer Head_r4;
	private final ModelRenderer Head_r5;
	private final ModelRenderer tabard;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public WFMModelGrailKnightHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		head.texOffs(0, 22).addBox(-2.5F, -11.0F, -2.5076F, 5.0F, 2.0F, 5.0F, -0.2F, false);
		head.texOffs(0, 36).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		shield_r1 = new ModelRenderer(this);
		shield_r1.setPos(-1.0F, -12.0F, -3.0F);
		head.addChild(shield_r1);
		setRotationAngle(shield_r1, 0.4363F, 0.0F, 0.0F);
		shield_r1.texOffs(0, 0).addBox(-1.5F, -5.0F, -1.0F, 5.0F, 7.0F, 0.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, -8.0F, 1.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, -0.0436F, 0.0F, 0.0F);
		head_r1.texOffs(14, 23).addBox(-5.8F, 0.3F, -6.5F, 11.5F, 2.0F, 11.0F, 0.1F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -8.0F, -7.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.2217F, 0.0F);
		cube_r1.texOffs(34, 43).addBox(0.2233F, -17.0F, -0.035F, 15.0F, 17.0F, 0.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, -8.0F, -7.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 1.2217F, 0.0F);
		cube_r2.texOffs(34, 43).addBox(-15.2233F, -17.0F, -0.035F, 15.0F, 17.0F, 0.0F, 0.0F, true);

		bone2 = new ModelRenderer(this);
		bone2.setPos(-0.0503F, -4.0F, -6.0503F);
		head.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -2.3562F, 0.0F);
		

		Head_r2 = new ModelRenderer(this);
		Head_r2.setPos(0.0F, 0.0F, 0.0F);
		bone2.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, 1.1781F, 0.0F);
		Head_r2.texOffs(50, 22).addBox(0.0F, 4.91F, 0.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
		Head_r2.texOffs(50, 22).addBox(0.0F, -4.09F, 0.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
		Head_r2.texOffs(48, 17).addBox(0.0F, -4.1F, 0.0F, 0.0F, 9.0F, 8.0F, 0.0F, false);

		Head_r3 = new ModelRenderer(this);
		Head_r3.setPos(0.0F, 0.0F, 0.2003F);
		bone2.addChild(Head_r3);
		setRotationAngle(Head_r3, 0.0F, 1.1781F, 0.0F);
		Head_r3.texOffs(39, 52).addBox(0.9239F, 0.9F, 0.3827F, 0.0F, 4.0F, 8.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setPos(-0.0503F, -4.0F, -6.0503F);
		head.addChild(bone);
		

		Head_r4 = new ModelRenderer(this);
		Head_r4.setPos(0.0F, 9.0F, 0.0F);
		bone.addChild(Head_r4);
		setRotationAngle(Head_r4, 0.0F, 1.1781F, 0.0F);
		Head_r4.texOffs(50, 22).addBox(-1.0F, -4.1F, 0.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
		Head_r4.texOffs(50, 22).addBox(-1.0F, -13.1F, 0.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
		Head_r4.texOffs(48, 17).addBox(0.0F, -13.1F, 0.0F, 0.0F, 9.0F, 8.0F, 0.0F, false);

		Head_r5 = new ModelRenderer(this);
		Head_r5.setPos(0.0F, 0.0F, 0.2003F);
		bone.addChild(Head_r5);
		setRotationAngle(Head_r5, 0.0F, 1.1781F, 0.0F);
		Head_r5.texOffs(39, 52).addBox(0.0F, 0.9F, 0.0F, 0.0F, 4.0F, 8.0F, 0.0F, false);

		tabard = new ModelRenderer(this);
		tabard.setPos(0.0F, -6.0F, 5.0F);
		head.addChild(tabard);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(5.0F, -2.0F, -6.0F);
		tabard.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.4638F, 1.4796F, 1.3758F);
		cube_r3.texOffs(0, 55).addBox(-6.0F, 1.0F, 0.3F, 7.0F, 7.0F, 0.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-5.0F, -2.0F, -6.0F);
		tabard.addChild(cube_r4);
		setRotationAngle(cube_r4, 1.4638F, -1.4796F, -1.3758F);
		cube_r4.texOffs(0, 48).addBox(-1.0F, 1.0F, 0.3F, 7.0F, 7.0F, 0.0F, 0.0F, true);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(-5.0F, -2.0F, -6.0F);
		tabard.addChild(cube_r5);
		setRotationAngle(cube_r5, 3.0543F, 0.0F, -3.1416F);
		cube_r5.texOffs(16, 54).addBox(-10.5F, 2.0F, -5.8F, 11.0F, 10.0F, 0.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}