// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelGraveGuardChestplate extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer chest6;
	private final ModelRenderer chest7;
	private final ModelRenderer chest8;
	private final ModelRenderer chest9;
	private final ModelRenderer chest10;
	private final ModelRenderer chest;
	private final ModelRenderer chest2;
	private final ModelRenderer chest3;
	private final ModelRenderer chest4;
	private final ModelRenderer chest5;
	private final ModelRenderer leftArm;
	private final ModelRenderer shoulder;
	private final ModelRenderer group;
	private final ModelRenderer cube_r1;
	private final ModelRenderer group2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer group3;
	private final ModelRenderer cube_r3;
	private final ModelRenderer rightArm;
	private final ModelRenderer shoulder2;
	private final ModelRenderer group4;
	private final ModelRenderer cube_r4;
	private final ModelRenderer group5;
	private final ModelRenderer cube_r5;
	private final ModelRenderer group6;
	private final ModelRenderer cube_r6;

	public WFMModelGraveGuardChestplate() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, true);
		body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, true);

		chest6 = new ModelRenderer(this);
		chest6.setPos(0.0F, 0.5355F, 1.0F);
		body.addChild(chest6);
		setRotationAngle(chest6, 2.2555F, 0.6591F, -2.6779F);
		chest6.texOffs(0, 46).addBox(-3.5F, -3.5F, -1.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);

		chest7 = new ModelRenderer(this);
		chest7.setPos(-1.3195F, 1.3195F, 1.2321F);
		chest6.addChild(chest7);
		setRotationAngle(chest7, 0.3185F, 0.3035F, 0.0491F);
		chest7.texOffs(0, 37).addBox(-3.5F, -3.5F, -1.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);

		chest8 = new ModelRenderer(this);
		chest8.setPos(-1.1585F, 1.1585F, 1.1472F);
		chest7.addChild(chest8);
		setRotationAngle(chest8, 0.1872F, 0.1841F, 0.0173F);
		chest8.texOffs(18, 55).addBox(-3.5F, -3.5F, -1.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);

		chest9 = new ModelRenderer(this);
		chest9.setPos(-1.3289F, 1.3289F, 0.684F);
		chest8.addChild(chest9);
		setRotationAngle(chest9, 0.0928F, 0.0924F, 0.0043F);
		chest9.texOffs(18, 46).addBox(-3.5F, -3.5F, -1.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);

		chest10 = new ModelRenderer(this);
		chest10.setPos(-1.3807F, 1.3807F, 0.4329F);
		chest9.addChild(chest10);
		chest10.texOffs(18, 37).addBox(-3.5F, -3.5F, -1.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);

		chest = new ModelRenderer(this);
		chest.setPos(0.0F, 0.5355F, -1.0F);
		body.addChild(chest);
		setRotationAngle(chest, -0.8861F, -0.6591F, -0.4636F);
		chest.texOffs(0, 46).addBox(-3.5F, -3.5F, -1.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);

		chest2 = new ModelRenderer(this);
		chest2.setPos(-1.3195F, 1.3195F, 1.2321F);
		chest.addChild(chest2);
		setRotationAngle(chest2, 0.3185F, 0.3035F, 0.0491F);
		chest2.texOffs(0, 37).addBox(-3.5F, -3.5F, -1.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);

		chest3 = new ModelRenderer(this);
		chest3.setPos(-1.1585F, 1.1585F, 1.1472F);
		chest2.addChild(chest3);
		setRotationAngle(chest3, 0.1872F, 0.1841F, 0.0173F);
		chest3.texOffs(18, 55).addBox(-3.5F, -3.5F, -1.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);

		chest4 = new ModelRenderer(this);
		chest4.setPos(-1.3289F, 1.3289F, 0.684F);
		chest3.addChild(chest4);
		setRotationAngle(chest4, 0.0928F, 0.0924F, 0.0043F);
		chest4.texOffs(18, 46).addBox(-3.5F, -3.5F, -1.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);

		chest5 = new ModelRenderer(this);
		chest5.setPos(-1.3807F, 1.3807F, 0.4329F);
		chest4.addChild(chest5);
		chest5.texOffs(18, 37).addBox(-3.5F, -3.5F, -1.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, 2.0F, 0.0F);
		leftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		leftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		shoulder = new ModelRenderer(this);
		shoulder.setPos(1.0F, -0.5F, 0.0F);
		leftArm.addChild(shoulder);
		

		group = new ModelRenderer(this);
		group.setPos(0.0F, -3.0F, 0.0F);
		shoulder.addChild(group);
		setRotationAngle(group, 0.0F, 0.0F, -0.4363F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		group.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
		cube_r1.texOffs(40, 56).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);

		group2 = new ModelRenderer(this);
		group2.setPos(1.0647F, 1.9663F, 0.0F);
		group.addChild(group2);
		setRotationAngle(group2, 0.0F, 0.0F, 0.6109F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		group2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
		cube_r2.texOffs(40, 48).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);

		group3 = new ModelRenderer(this);
		group3.setPos(1.0647F, 1.9663F, 0.0F);
		group2.addChild(group3);
		setRotationAngle(group3, 0.0F, 0.0F, 0.6109F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, 0.0F, 0.0F);
		group3.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
		cube_r3.texOffs(40, 40).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, 2.0F, 0.0F);
		rightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		rightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		shoulder2 = new ModelRenderer(this);
		shoulder2.setPos(-1.0F, -0.5F, 0.0F);
		rightArm.addChild(shoulder2);
		setRotationAngle(shoulder2, 0.0F, 3.1416F, 0.0F);
		

		group4 = new ModelRenderer(this);
		group4.setPos(0.0F, -3.0F, 0.0F);
		shoulder2.addChild(group4);
		setRotationAngle(group4, 0.0F, 0.0F, -0.4363F);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 0.0F, 0.0F);
		group4.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.7854F, 0.0F);
		cube_r4.texOffs(40, 56).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);

		group5 = new ModelRenderer(this);
		group5.setPos(1.0647F, 1.9663F, 0.0F);
		group4.addChild(group5);
		setRotationAngle(group5, 0.0F, 0.0F, 0.6109F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, 0.0F, 0.0F);
		group5.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.7854F, 0.0F);
		cube_r5.texOffs(40, 48).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);

		group6 = new ModelRenderer(this);
		group6.setPos(1.0647F, 1.9663F, 0.0F);
		group5.addChild(group6);
		setRotationAngle(group6, 0.0F, 0.0F, 0.6109F);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.0F, 0.0F, 0.0F);
		group6.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.7854F, 0.0F);
		cube_r6.texOffs(40, 40).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}