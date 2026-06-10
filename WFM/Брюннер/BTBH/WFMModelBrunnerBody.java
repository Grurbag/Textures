// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBrunnerBody extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer remenb;
	private final ModelRenderer cube_r1;
	private final ModelRenderer remenb2;
	private final ModelRenderer remenb3;
	private final ModelRenderer remenb4;
	private final ModelRenderer cube_r2;
	private final ModelRenderer smallKnife;
	private final ModelRenderer remenb5;
	private final ModelRenderer cube_r3;
	private final ModelRenderer smallKnife2;
	private final ModelRenderer smallKnife3;
	private final ModelRenderer smallKnife4;
	private final ModelRenderer smallKnife5;
	private final ModelRenderer smallKnife6;
	private final ModelRenderer rightArm;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArm_r2;
	private final ModelRenderer shoulder;
	private final ModelRenderer spikes;
	private final ModelRenderer spike_r1;
	private final ModelRenderer spike_r2;
	private final ModelRenderer leftArm;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer RightArm_r2;
	private final ModelRenderer shoulderRight;
	private final ModelRenderer knife;
	private final ModelRenderer knife_r1;
	private final ModelRenderer spikes2;
	private final ModelRenderer spike_r3;
	private final ModelRenderer spike_r4;

	public WFMModelBrunnerBody() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);

		remenb = new ModelRenderer(this);
		remenb.setPos(-0.0315F, 6.306F, -3.0F);
		body.addChild(remenb);
		setRotationAngle(remenb, 0.0F, 0.0F, 1.0036F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-1.4329F, 1.9526F, 0.0F);
		remenb.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3054F);
		cube_r1.texOffs(0, 50).addBox(-7.0F, -1.5F, -0.31F, 14.0F, 3.0F, 0.0F, 0.0F, false);

		remenb2 = new ModelRenderer(this);
		remenb2.setPos(-0.0315F, 11.306F, -3.0F);
		body.addChild(remenb2);
		remenb2.texOffs(2, 47).addBox(-5.0F, -1.5F, -0.5F, 10.0F, 3.0F, 0.0F, 0.0F, false);

		remenb3 = new ModelRenderer(this);
		remenb3.setPos(-0.0315F, 11.306F, 3.0F);
		body.addChild(remenb3);
		remenb3.texOffs(2, 44).addBox(-5.0F, -1.5F, -0.1F, 10.0F, 3.0F, 0.0F, 0.0F, false);

		remenb4 = new ModelRenderer(this);
		remenb4.setPos(1.8759F, 6.9074F, -3.0F);
		body.addChild(remenb4);
		setRotationAngle(remenb4, 0.0F, 0.0F, 1.8762F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-1.0F, 0.0F, -0.01F);
		remenb4.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.0873F);
		cube_r2.texOffs(0, 50).addBox(-7.0F, -1.5F, -0.3F, 14.0F, 3.0F, 0.0F, 0.0F, false);

		smallKnife = new ModelRenderer(this);
		smallKnife.setPos(-3.9252F, 7.9662F, -4.0F);
		body.addChild(smallKnife);
		setRotationAngle(smallKnife, 0.0F, 0.0F, 1.2654F);
		smallKnife.texOffs(22, 54).addBox(-1.9748F, -7.0F, 1.9F, 7.0F, 10.0F, 0.0F, -1.0F, false);

		remenb5 = new ModelRenderer(this);
		remenb5.setPos(-1.8358F, 12.0283F, -3.0F);
		body.addChild(remenb5);
		setRotationAngle(remenb5, 0.0F, 0.0F, 1.8762F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-1.0F, 0.0F, -0.01F);
		remenb5.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.0873F);
		cube_r3.texOffs(8, 50).addBox(-1.0F, -1.5F, 0.0F, 6.0F, 3.0F, 0.0F, 0.0F, false);

		smallKnife2 = new ModelRenderer(this);
		smallKnife2.setPos(-4.5266F, 6.0588F, -4.0F);
		body.addChild(smallKnife2);
		setRotationAngle(smallKnife2, 0.0F, 0.0F, 1.2654F);
		smallKnife2.texOffs(22, 54).addBox(-2.0734F, -7.0F, 1.9F, 7.0F, 10.0F, 0.0F, -1.0F, false);

		smallKnife3 = new ModelRenderer(this);
		smallKnife3.setPos(-5.128F, 4.1514F, -4.0F);
		body.addChild(smallKnife3);
		setRotationAngle(smallKnife3, 0.0F, 0.0F, 1.2654F);
		smallKnife3.texOffs(22, 54).addBox(-2.1734F, -7.0F, 1.9F, 7.0F, 10.0F, 0.0F, -1.0F, false);

		smallKnife4 = new ModelRenderer(this);
		smallKnife4.setPos(1.3649F, 8.6812F, -1.95F);
		body.addChild(smallKnife4);
		setRotationAngle(smallKnife4, 0.0F, 0.0F, -1.3526F);
		smallKnife4.texOffs(22, 54).addBox(-3.5F, -5.0F, -0.14F, 7.0F, 10.0F, 0.0F, -1.0F, false);

		smallKnife5 = new ModelRenderer(this);
		smallKnife5.setPos(1.7977F, 6.7286F, -1.95F);
		body.addChild(smallKnife5);
		setRotationAngle(smallKnife5, 0.0F, 0.0F, -1.3526F);
		smallKnife5.texOffs(22, 54).addBox(-3.3F, -5.0F, -0.15F, 7.0F, 10.0F, 0.0F, -1.0F, false);

		smallKnife6 = new ModelRenderer(this);
		smallKnife6.setPos(2.2306F, 4.776F, -1.95F);
		body.addChild(smallKnife6);
		setRotationAngle(smallKnife6, 0.0F, 0.0F, -1.3526F);
		smallKnife6.texOffs(22, 54).addBox(-3.1306F, -5.0F, -0.15F, 7.0F, 10.0F, 0.0F, -1.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-5.0F, 2.0F, 0.0F);
		rightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		rightArm.texOffs(0, 0).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setPos(-1.1061F, 0.81F, 0.0F);
		rightArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.0436F);
		LeftArm_r1.texOffs(40, 0).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F, -0.15F, true);

		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setPos(-1.2479F, -0.4674F, 0.0F);
		rightArm.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, 0.0F, 0.0F, -0.1309F);
		LeftArm_r2.texOffs(40, 32).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, false);
		LeftArm_r2.texOffs(40, 43).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.3F, false);

		shoulder = new ModelRenderer(this);
		shoulder.setPos(-0.9915F, -2.8715F, -0.0229F);
		rightArm.addChild(shoulder);
		setRotationAngle(shoulder, 0.0046F, -0.0229F, -0.1289F);
		shoulder.texOffs(0, 53).addBox(-1.0F, -2.0F, -3.9769F, 1.0F, 3.0F, 8.0F, 0.0F, false);

		spikes = new ModelRenderer(this);
		spikes.setPos(0.0F, 0.0F, 0.0F);
		rightArm.addChild(spikes);
		spikes.texOffs(0, 0).addBox(-4.5F, 4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		spikes.texOffs(0, 1).addBox(-4.5F, 6.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		spikes.texOffs(0, 2).addBox(-4.5F, 8.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		spike_r1 = new ModelRenderer(this);
		spike_r1.setPos(-2.5F, 8.5F, -4.0F);
		spikes.addChild(spike_r1);
		setRotationAngle(spike_r1, 0.0F, -1.5708F, 0.0F);
		spike_r1.texOffs(0, 1).addBox(0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		spike_r1.texOffs(0, 0).addBox(0.5F, -2.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		spike_r1.texOffs(0, 2).addBox(0.5F, -4.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		spike_r2 = new ModelRenderer(this);
		spike_r2.setPos(-2.5F, 8.5F, 4.0F);
		spikes.addChild(spike_r2);
		setRotationAngle(spike_r2, 0.0F, 1.5708F, 0.0F);
		spike_r2.texOffs(0, 0).addBox(0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		spike_r2.texOffs(0, 2).addBox(0.5F, -2.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		spike_r2.texOffs(0, 1).addBox(0.5F, -4.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(5.0F, 2.0F, 0.0F);
		leftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		leftArm.texOffs(0, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setPos(1.1061F, 0.81F, 0.0F);
		leftArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.0436F);
		RightArm_r1.texOffs(40, 0).addBox(-3.0F, -3.5F, -3.0F, 6.0F, 7.0F, 6.0F, -0.15F, false);

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setPos(1.0F, -0.5F, 0.0F);
		leftArm.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0F, 0.0F, 0.1309F);
		RightArm_r2.texOffs(40, 43).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.3F, true);
		RightArm_r2.texOffs(40, 32).addBox(-2.75F, -2.5F, -3.0F, 6.0F, 5.0F, 6.0F, 0.1F, true);

		shoulderRight = new ModelRenderer(this);
		shoulderRight.setPos(2.0809F, -3.2741F, 0.2698F);
		leftArm.addChild(shoulderRight);
		setRotationAngle(shoulderRight, 0.0046F, -0.0229F, 0.0893F);
		shoulderRight.texOffs(0, 53).addBox(-1.0F, -1.5259F, -3.9769F, 1.0F, 3.0F, 8.0F, 0.0F, false);

		knife = new ModelRenderer(this);
		knife.setPos(0.0F, -1.0F, -4.0F);
		leftArm.addChild(knife);
		setRotationAngle(knife, 0.0F, 0.0F, 0.829F);
		

		knife_r1 = new ModelRenderer(this);
		knife_r1.setPos(0.7136F, -2.1404F, 0.793F);
		knife.addChild(knife_r1);
		setRotationAngle(knife_r1, 0.0F, -0.2182F, -0.4363F);
		knife_r1.texOffs(0, 19).addBox(-3.5F, -6.0F, 0.0F, 7.0F, 15.0F, 0.0F, -0.5F, false);

		spikes2 = new ModelRenderer(this);
		spikes2.setPos(0.0F, 0.0F, 0.0F);
		leftArm.addChild(spikes2);
		setRotationAngle(spikes2, 0.0F, 3.1416F, 0.0F);
		spikes2.texOffs(0, 0).addBox(-4.5F, 4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		spikes2.texOffs(0, 1).addBox(-4.5F, 6.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		spikes2.texOffs(0, 2).addBox(-4.5F, 8.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		spike_r3 = new ModelRenderer(this);
		spike_r3.setPos(-2.5F, 8.5F, -4.0F);
		spikes2.addChild(spike_r3);
		setRotationAngle(spike_r3, 0.0F, -1.5708F, 0.0F);
		spike_r3.texOffs(0, 1).addBox(0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		spike_r3.texOffs(0, 0).addBox(0.5F, -2.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		spike_r3.texOffs(0, 2).addBox(0.5F, -4.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		spike_r4 = new ModelRenderer(this);
		spike_r4.setPos(-2.5F, 8.5F, 4.0F);
		spikes2.addChild(spike_r4);
		setRotationAngle(spike_r4, 0.0F, 1.5708F, 0.0F);
		spike_r4.texOffs(0, 0).addBox(0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		spike_r4.texOffs(0, 2).addBox(0.5F, -2.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		spike_r4.texOffs(0, 1).addBox(0.5F, -4.5F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}